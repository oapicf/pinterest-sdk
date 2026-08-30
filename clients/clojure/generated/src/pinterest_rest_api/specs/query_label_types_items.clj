(ns pinterest-rest-api.specs.query-label-types-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def query-label-types-items-data
  {
   })

(def query-label-types-items-spec
  (ds/spec
    {:name ::query-label-types-items
     :spec query-label-types-items-data}))
