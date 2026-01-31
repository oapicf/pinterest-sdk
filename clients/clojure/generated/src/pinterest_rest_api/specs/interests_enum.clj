(ns pinterest-rest-api.specs.interests-enum
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def interests-enum-data
  {
   })

(def interests-enum-spec
  (ds/spec
    {:name ::interests-enum
     :spec interests-enum-data}))
