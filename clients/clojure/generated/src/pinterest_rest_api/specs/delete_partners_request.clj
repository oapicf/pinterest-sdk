(ns pinterest-rest-api.specs.delete-partners-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-partners-request-data
  {
   (ds/req :partner_ids) (s/coll-of string?)
   (ds/opt :partner_type) string?
   })

(def delete-partners-request-spec
  (ds/spec
    {:name ::delete-partners-request
     :spec delete-partners-request-data}))
