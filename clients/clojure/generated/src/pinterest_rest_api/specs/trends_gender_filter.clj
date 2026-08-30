(ns pinterest-rest-api.specs.trends-gender-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def trends-gender-filter-data
  {
   })

(def trends-gender-filter-spec
  (ds/spec
    {:name ::trends-gender-filter
     :spec trends-gender-filter-data}))
