(ns pinterest-rest-api.specs.deleted-members-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def deleted-members-response-data
  {
   (ds/opt :deleted_members) (s/coll-of string?)
   })

(def deleted-members-response-spec
  (ds/spec
    {:name ::deleted-members-response
     :spec deleted-members-response-data}))
