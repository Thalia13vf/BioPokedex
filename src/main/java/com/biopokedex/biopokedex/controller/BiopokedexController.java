package com.biopokedex.biopokedex.controller;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.biopokedex.biopokedex.model.BioLixiviador;

@Controller
public class BiopokedexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model){
		List<BioLixiviador> lista = getList();
		
		model.addAttribute("biolixiviadores", lista);
		return "lista";
	}
	
	@RequestMapping("bacterias/{id}")
	public String mostrar(@PathVariable("id") Integer id, Model model) {
		BioLixiviador bio = getObject(id);
		model.addAttribute("biolixiviador", bio);
		model.addAttribute("tipo", bio.getTipo());
		model.addAttribute("anterior", getAnterior(id));
		model.addAttribute("proximo", getProximo(id));
		return "bacterias";
	}
	
	public List<BioLixiviador> getList(){
		List<BioLixiviador> lista = new LinkedList<BioLixiviador>();
		lista.add(new BioLixiviador(0, "Leptospirillum ferrooxidans","Metal", "Nitrospirae", "Nitrospirales", "Nitrospiraceae", 
				"Bacterias gram-negativas responsáveis pela lixiviação de metais, formando ions férricos (Fe3+) e ácido sulfúrico, estas bactérias são capazes de realizar lixiviação indireta, ocorrendo regeneração do sulfato férrico e também produzir ácido sulfúrico a partir do enxofre por meio de ações biológicas. O ácido sulfúrico é muito importante, pois é responsável por manter a faixa de pH favorável para o desenvolvimento das bactérias.", "nitrospira.jpg"));
		lista.add(new BioLixiviador(1, "Leptospirillum ferriphilum","Metal", "Nitrospirae", "Nitrospirales", "Nitrospiraceae", 
				"Bacterias gram-negativas responsáveis pela lixiviação de metais, formando ions férricos (Fe3+) e ácido sulfúrico, estas bactérias são capazes de realizar lixiviação indireta, ocorrendo regeneração do sulfato férrico e também produzir ácido sulfúrico a partir do enxofre por meio de ações biológicas. O ácido sulfúrico é muito importante, pois é responsável por manter a faixa de pH favorável para o desenvolvimento das bactérias.", "Leptocell.jpg"));
		
		lista.add(new BioLixiviador(2,"Acidithiobacillus thiooxidans","Composto Químico", "Proteobacteria", "Acidithiobacillales", "Acidithiobacilliaceae", "bactéria gram-negativa que uso enxofre como fonte de energia e para conseguir é capaz de lixiviar alguns metais e minerais. Sendo importante para a diminuição de alguns metais tóxicos como cobalto e lítio.", "thiooxidans.png"));
		lista.add(new BioLixiviador(3, "Acidithiobacillus ferrooxidans", "Metal", "Proteobacteria", "Acidithiobacillia", "Acidithiobacilliaceae", " Bactérias aeróbias fixadoras de dióxido de carbono; Têm seu pH ótimo na faixa entre 2 e 3; São conhecidas pela catalisação da oxidação do Fe2+ à Fe3+;Utilizam-se de substratos inorgânicos (sulfatos ou cátions metálicos reduzidos) como fonte de energia (França et al., 2004); Possui resistência elevada à altas concentrações de metais tóxicos (cromo, níquel, manganês) (Novo, 1998); França et al., 2004, observaram remoções entre 40% e 85% em lodos de esgoto para zinco, cromo, níquel, cádmio, cobre e chumbo (França et al., 2004); Reação de biolixiviação de metais\r\n" + 
				"\r\n" + 
				"A.ferrooxidans\r\n" + 
				"Processo indireto:            Fe2+ + 0,5 O2 + 2 H+ → Fe3+ + H2O \r\n" + 
				"                            4Fe3+ + MS + 2H2O + O2 → M2+ + 4Fe2+ + SO42- + 4H+\r\n" + 
				"\r\n" + 
				"A.thiooxidans\r\n" + 
				"Processo direto:                       MS + 2O2 → M2+ + SO42-\r\n" + 
				"", "ferrooxidans.png"));
		lista.add(new BioLixiviador(4, "Sulfobacillus thermosulfidooxidans", "Metal", "Proteobacteria", "Sulfobacillus", "Alicyclobacillaceae", " Termófilas moderadas, possibilitando processos em temperaturas elevadas (50°C); pH ótimo de 1,7; São heterotróficas, e conhecidas por oxidarem Fe2+ e enxofre elementar; Utilizados para a recuperação de metais em baixos teores, como no caso de pilhas e minérios (jarositas e calcopiritas) (SICUPIRA, 2011).", "thermosulfidooxidans.png"));
		lista.add(new BioLixiviador(5, "?", "?", "?", "?", "?", "?", "novas.png"));
		lista.add(new BioLixiviador(6, "?", "?", "?", "?", "?", "?", "novas.png"));
		
		return lista;
	}
	
	@RequestMapping("referencias")
	public String referencia() {
		return "referencia";
	}
	private BioLixiviador getObject(Integer id) {
		List<BioLixiviador> lista = getList();
		if(id < lista.size()) {
			return lista.get(id);
		}else {
			return lista.get(0);
		}
	}
	
	private BioLixiviador getAnterior(int id) {
		int idLista = id - 1;
		List<BioLixiviador> lista = getList();
		if(idLista < 0) {
			return lista.get(lista.size() - 1);
		}
		return lista.get(idLista); 
		
	}
	
	private BioLixiviador getProximo(int id) {
		int idLista = id + 1;
		List<BioLixiviador> lista = getList();
		if(idLista > lista.size() - 1) {
			return lista.get(0);
		}
		return lista.get(idLista);
	}
	
}
