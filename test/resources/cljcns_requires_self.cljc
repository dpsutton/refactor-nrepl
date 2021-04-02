(ns resources.cljcns-requires-self
  #?(:cljs
     (:require-macros [resources.cljcns-requires-self :refer [foo]])))

#?(:clj
   (defmacro foo []))
