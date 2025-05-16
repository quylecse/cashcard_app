package io.github.quylecse.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcard")
class CashCardController {

    @GetMapping("/{requestedID}")
    private ResponseEntity<String> findbyID() {
        return ResponseEntity.ok("{}");
    }
}
