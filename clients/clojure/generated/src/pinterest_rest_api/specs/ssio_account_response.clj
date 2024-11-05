(ns pinterest-rest-api.specs.ssio-account-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ssio-account-item :refer :all]
            [pinterest-rest-api.specs.ssio-account-pmp-name :refer :all]
            )
  (:import (java.io File)))


(def ssio-account-response-data
  {
   (ds/opt :eligible) boolean?
   (ds/opt :can_edit) boolean?
   (ds/opt :billto_infos) (s/coll-of ssio-account-item-spec)
   (ds/opt :currency) string?
   (ds/opt :pmp_names) (s/coll-of ssio-account-pmp-name-spec)
   (ds/opt :error) string?
   })

(def ssio-account-response-spec
  (ds/spec
    {:name ::ssio-account-response
     :spec ssio-account-response-data}))
