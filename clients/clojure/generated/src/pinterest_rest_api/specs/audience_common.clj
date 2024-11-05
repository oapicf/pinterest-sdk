(ns pinterest-rest-api.specs.audience-common
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-rule :refer :all]
            )
  (:import (java.io File)))


(def audience-common-data
  {
   (ds/opt :ad_account_id) string?
   (ds/opt :name) string?
   (ds/opt :rule) audience-rule-spec
   })

(def audience-common-spec
  (ds/spec
    {:name ::audience-common
     :spec audience-common-data}))
