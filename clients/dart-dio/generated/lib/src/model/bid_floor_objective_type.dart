//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_floor_objective_type.g.dart';

class BidFloorObjectiveType extends EnumClass {

  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'AWARENESS')
  static const BidFloorObjectiveType AWARENESS = _$AWARENESS;
  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'CONSIDERATION')
  static const BidFloorObjectiveType CONSIDERATION = _$CONSIDERATION;
  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'WEB_CONVERSION')
  static const BidFloorObjectiveType WEB_CONVERSION = _$WEB_CONVERSION;
  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'CATALOG_SALES')
  static const BidFloorObjectiveType CATALOG_SALES = _$CATALOG_SALES;
  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'VIDEO_COMPLETION')
  static const BidFloorObjectiveType VIDEO_COMPLETION = _$VIDEO_COMPLETION;
  /// Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
  @BuiltValueEnumConst(wireName: r'SALES')
  static const BidFloorObjectiveType SALES = _$SALES;

  static Serializer<BidFloorObjectiveType> get serializer => _$bidFloorObjectiveTypeSerializer;

  const BidFloorObjectiveType._(String name): super(name);

  static BuiltSet<BidFloorObjectiveType> get values => _$values;
  static BidFloorObjectiveType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BidFloorObjectiveTypeMixin = Object with _$BidFloorObjectiveTypeMixin;

