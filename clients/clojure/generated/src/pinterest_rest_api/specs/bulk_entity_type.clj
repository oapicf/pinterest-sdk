(ns pinterest-rest-api.specs.bulk-entity-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-entity-type-data
  {
   })

(def bulk-entity-type-spec
  (ds/spec
    {:name ::bulk-entity-type
     :spec bulk-entity-type-data}))
