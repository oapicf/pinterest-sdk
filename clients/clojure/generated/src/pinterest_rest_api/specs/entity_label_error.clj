(ns pinterest-rest-api.specs.entity-label-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.entity-label :refer :all]
            )
  (:import (java.io File)))


(def entity-label-error-data
  {
   (ds/opt :data) entity-label-spec
   (ds/opt :error_messages) (s/coll-of string?)
   })

(def entity-label-error-spec
  (ds/spec
    {:name ::entity-label-error
     :spec entity-label-error-data}))
