(ns pinterest-rest-api.specs.invite-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-type-data
  {
   })

(def invite-type-spec
  (ds/spec
    {:name ::invite-type
     :spec invite-type-data}))
