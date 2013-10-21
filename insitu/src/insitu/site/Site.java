package insitu.site;

/**
 * Klasse für einen Bauplatz.
 * 
 * @author tk
 */
public class Site {

  String name;

  /**
   * @param name - Bezeichnung der Baustelle.
   */
  public Site(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "Site["+name+"]";
  }

}
