package test;

import br.com.daniel.dao.IProdutoDao;
import br.com.daniel.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new br.com.daniel.dao.ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A2");
        produto.setDescricao("AMERICANAS");
        produto.setNome("PC GAMER");
        produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}

