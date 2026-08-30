(ns pinterest-rest-api.specs.pinterest/lib/batch-item-exception
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pinterest/lib/batch-item-exception-data
  {
   (ds/opt :code) int?
   (ds/req :message) string?
   })

(def pinterest/lib/batch-item-exception-spec
  (ds/spec
    {:name ::pinterest/lib/batch-item-exception
     :spec pinterest/lib/batch-item-exception-data}))
