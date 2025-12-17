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
    @GetMapping("/get")
    public List<StudentEntity>
    getAllstudents(){
        return 
        studentservice.getAllStudentEntity(;
    }
    @GetMapping("/get/{id}")
    public
    Optional<studentEntity>
    get(@pathVariable int id) {
        return 
        studentservice.getStudentById(id);
    }
    @PutMapping("/update{id}")
    public String
    update(@RequestBody Stu
}