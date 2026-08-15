//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_mask_bid_option_field.g.dart';

class UpdateMaskBidOptionField extends EnumClass {

  /// bid option field to apply operation updates to
  @BuiltValueEnumConst(wireName: r'BID')
  static const UpdateMaskBidOptionField BID = _$BID;
  /// bid option field to apply operation updates to
  @BuiltValueEnumConst(wireName: r'APP_TYPE_BID_MULTIPLIER_SET')
  static const UpdateMaskBidOptionField APP_TYPE_BID_MULTIPLIER_SET = _$APP_TYPE_BID_MULTIPLIER_SET;
  /// bid option field to apply operation updates to
  @BuiltValueEnumConst(wireName: r'PLACEMENT_BID_MULTIPLIER_SET')
  static const UpdateMaskBidOptionField PLACEMENT_BID_MULTIPLIER_SET = _$PLACEMENT_BID_MULTIPLIER_SET;

  static Serializer<UpdateMaskBidOptionField> get serializer => _$updateMaskBidOptionFieldSerializer;

  const UpdateMaskBidOptionField._(String name): super(name);

  static BuiltSet<UpdateMaskBidOptionField> get values => _$values;
  static UpdateMaskBidOptionField valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class UpdateMaskBidOptionFieldMixin = Object with _$UpdateMaskBidOptionFieldMixin;

