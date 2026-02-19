package br.com.joaodev.keywords.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_labels")
public class Label {

    @Id
    @Column(name = "id_label")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "label_value", unique = true, nullable = false)
    private String value;

    @ManyToMany
    @JoinTable(name = "tb_labels_keywords", 
                joinColumns = @JoinColumn(name = "tb_label_id_label"), 
                inverseJoinColumns = @JoinColumn(name = "tb_keyword_id_keyword"))
    private List<Keyword> keywords;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }
}
