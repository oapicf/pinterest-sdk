(ns pinterest-rest-api.specs.delete-partners-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-partners-response-data
  {
   (ds/opt :deleted_partners) (s/coll-of string?)
   })

(def delete-partners-response-spec
  (ds/spec
    {:name ::delete-partners-response
     :spec delete-partners-response-data}))
