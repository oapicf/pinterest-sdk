(ns pinterest-rest-api.specs.members-to-delete-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.members-to-delete-body-members-inner :refer :all]
            )
  (:import (java.io File)))


(def members-to-delete-body-data
  {
   (ds/req :members) (s/coll-of members-to-delete-body-members-inner-spec)
   })

(def members-to-delete-body-spec
  (ds/spec
    {:name ::members-to-delete-body
     :spec members-to-delete-body-data}))
