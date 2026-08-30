(ns pinterest-rest-api.specs.business-search-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-search-by-data
  {
   })

(def business-search-by-spec
  (ds/spec
    {:name ::business-search-by
     :spec business-search-by-data}))
