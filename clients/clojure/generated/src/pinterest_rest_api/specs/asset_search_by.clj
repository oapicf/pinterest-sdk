(ns pinterest-rest-api.specs.asset-search-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def asset-search-by-data
  {
   })

(def asset-search-by-spec
  (ds/spec
    {:name ::asset-search-by
     :spec asset-search-by-data}))
