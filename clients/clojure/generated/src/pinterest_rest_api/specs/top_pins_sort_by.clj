(ns pinterest-rest-api.specs.top-pins-sort-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def top-pins-sort-by-data
  {
   })

(def top-pins-sort-by-spec
  (ds/spec
    {:name ::top-pins-sort-by
     :spec top-pins-sort-by-data}))
