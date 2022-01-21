package com.github.demidko.ruwordnet

import edu.mit.jwi.Dictionary
import edu.mit.jwi.IDictionary
import edu.mit.jwi.item.ISenseKey
import edu.mit.jwi.item.POS
import edu.mit.jwi.item.POS.ADJECTIVE
import edu.mit.jwi.item.SynsetID
import java.net.URL

/**
 * Тезарус [RuWordNet](https://ruwordnet.ru)
 */
object RuWordNet {

  private val dictionary: IDictionary

  init {
    dictionary = Dictionary(URL("file",  null,"/Users/admin/Projects/Utils/ruwordnet/src/main/resources/ruwordnet"))
    println(dictionary.open())
  }

  /**
   * Найти синонимы слова
   */
  fun findSynonyms(word: String): Set<String> {
    println(dictionary.getIndexWordIterator(POS.VERB).hasNext())
    return emptySet()
  }
}
