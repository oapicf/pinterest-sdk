(ns pinterest-rest-api.specs.updatable-item-attributes-gtin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def updatable-item-attributes-gtin-data
  {
   })

(def updatable-item-attributes-gtin-spec
  (ds/spec
    {:name ::updatable-item-attributes-gtin
     :spec updatable-item-attributes-gtin-data}))
