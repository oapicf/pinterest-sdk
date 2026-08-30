(ns pinterest-rest-api.specs.delete-business-partners-delete
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.nullable-partner-type :refer :all]
            )
  (:import (java.io File)))


(def delete-business-partners-delete-data
  {
   (ds/req :partner_ids) (s/coll-of string?)
   (ds/opt :partner_type) nullable-partner-type-spec
   })

(def delete-business-partners-delete-spec
  (ds/spec
    {:name ::delete-business-partners-delete
     :spec delete-business-partners-delete-data}))
