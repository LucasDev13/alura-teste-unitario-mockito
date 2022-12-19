package leilao;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class HelloWorldMockito {

    @Test
    public void hello(){
        //Esse objeto devolvido é do tipo mock da classe dinamica que ele criou
        //Todos o métodos que for chamado, ele não vai executar o comportamento da classe original, ele simplismente vai fingir que está executando
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);//Quando executar essa linha o mockito vai criar uma classe em tempo de execução da leilaoDao
        //o mock vai chamar o método buscarTodos, mas ele não vai de fato no banco, somente vai devolver uma lista vazia fingindo que foi no banco.
        List<Leilao> leilaos = mock.buscarTodos();

        //Verficar se a lista está vazia.
        Assertions.assertTrue(leilaos.isEmpty());
    }
}
