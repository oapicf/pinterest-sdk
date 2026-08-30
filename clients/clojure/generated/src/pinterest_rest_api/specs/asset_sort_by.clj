(ns pinterest-rest-api.specs.asset-sort-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-sort-by-data
  {
   })

(def asset-sort-by-spec
  (ds/spec
    {:name ::asset-sort-by
     :spec asset-sort-by-data}))
