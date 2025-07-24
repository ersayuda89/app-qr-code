package id.api.controller;

import id.api.model.dto.ScanRequest;
import id.api.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ScanQrController {

    @Autowired
    private QrCodeService qrCodeService;

    @GetMapping("/scan")
    public String scanPage() {
        return "scan-camera";
    }

    @PostMapping("/api/scan/save")
    public ResponseEntity<String> saveScan(@RequestBody ScanRequest request) {
        qrCodeService.saveScanToExcel(request.getHasil(), request.getWaktu());
        return ResponseEntity.ok("Disimpan ke Excel");
    }
}