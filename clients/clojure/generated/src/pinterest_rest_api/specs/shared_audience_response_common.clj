(ns pinterest-rest-api.specs.shared-audience-response-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.role :refer :all]
            )
  (:import (java.io File)))


(def shared-audience-response-common-data
  {
   (ds/opt :audience_id) string?
   (ds/opt :permissions) (s/coll-of role-spec)
   })

(def shared-audience-response-common-spec
  (ds/spec
    {:name ::shared-audience-response-common
     :spec shared-audience-response-common-data}))
