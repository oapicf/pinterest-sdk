(ns pinterest-rest-api.specs.change-history-data-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def change-history-data-type-data
  {
   })

(def change-history-data-type-spec
  (ds/spec
    {:name ::change-history-data-type
     :spec change-history-data-type-data}))
