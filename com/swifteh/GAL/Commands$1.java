����   2 C  com/swifteh/GAL/Commands$1  java/lang/Object  java/lang/Runnable this$0 Lcom/swifteh/GAL/Commands; <init> (Lcom/swifteh/GAL/Commands;)V Code	    
   	  ()V LineNumberTable LocalVariableTable this Lcom/swifteh/GAL/Commands$1; run
    com/swifteh/GAL/Commands   access$0 1(Lcom/swifteh/GAL/Commands;)Lcom/swifteh/GAL/GAL;	    com/swifteh/GAL/GAL   ! db Lcom/swifteh/GAL/DB; # java/lang/StringBuilder % DELETE FROM `
 " ' 	 ( (Ljava/lang/String;)V	  * + , dbPrefix Ljava/lang/String;
 " . / 0 append -(Ljava/lang/String;)Ljava/lang/StringBuilder; 2 GALTotals`;
 " 4 5 6 toString ()Ljava/lang/String;
 8 : 9 com/swifteh/GAL/DB ; ( modifyQuery 
SourceFile Commands.java EnclosingMethod @ A 	onCommand f(Lorg/bukkit/command/CommandSender;Lorg/bukkit/command/Command;Ljava/lang/String;[Ljava/lang/String;)Z InnerClasses               	 
     8     
*+� *� �           
        
      +        Z     ,*� � � � "Y$� &*� � � )� -1� -� 3� 7�           ,        
    . + /  <    = >     ? B   
        