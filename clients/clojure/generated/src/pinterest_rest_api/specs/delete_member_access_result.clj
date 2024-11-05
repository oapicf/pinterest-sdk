(ns pinterest-rest-api.specs.delete-member-access-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delete-member-access-result-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :member_id) string?
   })

(def delete-member-access-result-spec
  (ds/spec
    {:name ::delete-member-access-result
     :spec delete-member-access-result-data}))
