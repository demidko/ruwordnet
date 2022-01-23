package com.github.demidko.ruwordnet

import net.sf.extjwnl.data.POS
import net.sf.extjwnl.dictionary.Dictionary
import org.xml.sax.InputSource


/**
 * Тезарус [RuWordNet](https://ruwordnet.ru)
 */
object RuWordNet {


  /**
   * Найти синонимы слова
   */
  fun findSynonyms(word: String): Set<String> {
    val d = Dictionary.getFileBackedInstance("/Users/admin/Projects/Utils/ruwordnet/src/main/resources/ruwordnet")

    println(d.getIndexWord(POS.NOUN, "секс"))
    return emptySet()
  }
}
