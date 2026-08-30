(ns pinterest-rest-api.specs.labeled-entities
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-label :refer :all]
            [pinterest-rest-api.specs.entity-label-error :refer :all]
            )
  (:import (java.io File)))


(def labeled-entities-data
  {
   (ds/opt :entities_labels) (s/coll-of entity-label-spec)
   (ds/opt :errors) (s/coll-of entity-label-error-spec)
   })

(def labeled-entities-spec
  (ds/spec
    {:name ::labeled-entities
     :spec labeled-entities-data}))
