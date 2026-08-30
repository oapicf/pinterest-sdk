(ns pinterest-rest-api.specs.business-member-sort-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-member-sort-by-data
  {
   })

(def business-member-sort-by-spec
  (ds/spec
    {:name ::business-member-sort-by
     :spec business-member-sort-by-data}))
