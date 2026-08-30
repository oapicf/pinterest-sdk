(ns pinterest-rest-api.specs.querymetrictypes-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def querymetrictypes-items-data
  {
   })

(def querymetrictypes-items-spec
  (ds/spec
    {:name ::querymetrictypes-items
     :spec querymetrictypes-items-data}))
