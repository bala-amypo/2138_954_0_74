packagecom.exampe.practice.controller;

@RestController
public class Studentcontroller{
    @Autowired
    Studentservice studentservice;

    @PostMapping("/add")
    public StudentEntity
    post(@RequestBody StudentEntity student){
        return
        studentservice.saveData(student);
    }
    @Get
}