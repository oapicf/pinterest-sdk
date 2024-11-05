(ns pinterest-rest-api.specs.update-member-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def update-member-result-data
  {
   (ds/opt :business_role) string?
   (ds/opt :member_id) string?
   })

(def update-member-result-spec
  (ds/spec
    {:name ::update-member-result
     :spec update-member-result-data}))
