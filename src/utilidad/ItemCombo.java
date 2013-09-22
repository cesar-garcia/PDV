/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidad;
/**
 *
 * @author seven
 */
public class ItemCombo {
   
  private String  dato;
  private String ids;
  private Integer id ;
  private Integer id1 ;
  private Integer id2 ;
  

  
  public ItemCombo(Integer id, String dato ) {
    this.dato=dato;
    this.id=id;
  }
  
  
  public ItemCombo(Integer id, Integer id1, String dato ) {
    this.dato=dato;
    this.id=id;
    this.id1=id1;
  }
  
  public ItemCombo(Integer id, Integer id1, Integer id2, String dato ) {
    this.dato=dato;
    this.id=id;
    this.id1=id1;
    this.id1=id2;
  }
   public ItemCombo(String ids,  String dato ) {
    this.dato=dato;
    this.ids=ids;
   
  }
 
  public ItemCombo(String ids, Integer id,  String dato ) {
    this.dato=dato;
    this.ids=ids;
    this.id = id;
  }
  
  public ItemCombo(String ids, Integer id, Integer id1,  String dato ) {
    this.dato=dato;
    this.ids=ids;
    this.id = id;
    this.id = id1;
  }
    
  public Integer getId(){
    return id ;
  }
  
  public Integer getId1(){
    return id1 ;
  }
   
  public Integer getId2(){
    return id2 ;
  }
  
  public String getIds(){
    return ids ;
  }
  public String getDato() {
    return dato ;
  }   
}
