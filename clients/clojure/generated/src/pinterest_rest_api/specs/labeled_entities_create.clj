(ns pinterest-rest-api.specs.labeled-entities-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def labeled-entities-create-data
  {
   (ds/req :entity_ids) (s/coll-of string?)
   })

(def labeled-entities-create-spec
  (ds/spec
    {:name ::labeled-entities-create
     :spec labeled-entities-create-data}))
