package com.pokemon

import com.requests.Request

object Pokedex{

  val scanner = new java.util.Scanner(System.in)
  Console.println("Choose a Pokemon Name")
  val line = scanner.nextLine()
  def main(args: Array[String]): Unit =
    println(Request.get( line ))

}
