(ns pinterest-rest-api.specs.queryvideopinmetrictypes-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def queryvideopinmetrictypes-items-data
  {
   })

(def queryvideopinmetrictypes-items-spec
  (ds/spec
    {:name ::queryvideopinmetrictypes-items
     :spec queryvideopinmetrictypes-items-data}))
