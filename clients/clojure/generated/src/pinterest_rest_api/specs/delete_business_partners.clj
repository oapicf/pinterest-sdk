(ns pinterest-rest-api.specs.delete-business-partners
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-business-partners-data
  {
   (ds/opt :deleted_partners) (s/coll-of string?)
   })

(def delete-business-partners-spec
  (ds/spec
    {:name ::delete-business-partners
     :spec delete-business-partners-data}))
