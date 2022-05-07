(ns pinterest-rest-api.specs.language
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def language-data
  {
   })

(def language-spec
  (ds/spec
    {:name ::language
     :spec language-data}))
