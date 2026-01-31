(ns pinterest-rest-api.specs.promotion-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promotion-type-data
  {
   })

(def promotion-type-spec
  (ds/spec
    {:name ::promotion-type
     :spec promotion-type-data}))
