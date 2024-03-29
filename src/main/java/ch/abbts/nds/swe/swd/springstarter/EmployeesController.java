package ch.abbts.nds.swe.swd.springstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/employees-secure")
public class EmployeesController {
  @GetMapping(path = "/", produces = "application/json")
  public List<String> employees() {
    return Arrays.asList(new String[]{
        "Tenzing Norgay",
        "Edmund Hillary",
        "These names",
        "should never be available",
        "to anonymous users!",
        "test entry"
    });
  }
}