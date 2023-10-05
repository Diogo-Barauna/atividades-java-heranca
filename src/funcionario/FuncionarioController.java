@Entity
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double salario;
    private String login;
    private String codigoEstacao;
    private String numeroRamal;
}

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public FuncionarioModel criarFuncionario(@RequestBody FuncionarioModel funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping
    public List<FuncionarioModel> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> buscarFuncionario(@PathVariable Long id) {
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(id);
        if (funcionario.isPresent()) {
            return ResponseEntity.ok(funcionario.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioModel> atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioModel novoFuncionario) {
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(id);
        if (funcionario.isPresent()) {
            FuncionarioModel funcionarioExistente = funcionario.get();

            funcionarioRepository.save(funcionarioExistente);
            return ResponseEntity.ok(funcionarioExistente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirFuncionario(@PathVariable Long id) {
        Optional<FuncionarioModel> funcionario = funcionarioRepository.findById(id);
        if (funcionario.isPresent()) {
            funcionarioRepository.delete(funcionario.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
