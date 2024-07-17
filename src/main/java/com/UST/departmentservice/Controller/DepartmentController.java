The provided Java code is written in Java 8. 

Here's the updated code compatible with Java 17, incorporating new language features, standards, and best practices:

```java
package com.UST.departmentservice.controller;

import com.UST.departmentservice.model.Department;
import com.UST.departmentservice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
}
```

Please note that in Java 17, the final modifier is generally preferred for constructor parameters to ensure immutability and clarity.