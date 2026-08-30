(ns pinterest-rest-api.specs.nullalble-match-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullalble-match-type-data
  {
   })

(def nullalble-match-type-spec
  (ds/spec
    {:name ::nullalble-match-type
     :spec nullalble-match-type-data}))
