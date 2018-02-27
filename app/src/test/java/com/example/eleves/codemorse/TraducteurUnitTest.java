package com.example.eleves.codemorse;

import org.junit.Before;
import org.junit.Test;
import com.example.eleves.codemorse.Traducteur;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TraducteurUnitTest {

    Traducteur traducteur;

    @Before
    public void initialisation() {
        traducteur = new Traducteur();
    }

    @Test
    public void toAlphaTest() throws Exception {
        assertEquals(traducteur.toAlpha("The quick brown fox jumps over the lazy dog"), String.valueOf(0));

    }
}
