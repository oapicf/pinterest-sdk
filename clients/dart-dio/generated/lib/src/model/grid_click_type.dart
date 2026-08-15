//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'grid_click_type.g.dart';

class GridClickType extends EnumClass {

  /// Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
  @BuiltValueEnumConst(wireName: r'CLOSEUP')
  static const GridClickType CLOSEUP = _$CLOSEUP;
  /// Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
  @BuiltValueEnumConst(wireName: r'DIRECT_TO_DESTINATION')
  static const GridClickType DIRECT_TO_DESTINATION = _$DIRECT_TO_DESTINATION;

  static Serializer<GridClickType> get serializer => _$gridClickTypeSerializer;

  const GridClickType._(String name): super(name);

  static BuiltSet<GridClickType> get values => _$values;
  static GridClickType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class GridClickTypeMixin = Object with _$GridClickTypeMixin;

