//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_order_line_type.g.dart';

class SSIOOrderLineType extends EnumClass {

  /// The type of an SSIO order line.
  @BuiltValueEnumConst(wireName: r'BUDGET')
  static const SSIOOrderLineType BUDGET = _$BUDGET;
  /// The type of an SSIO order line.
  @BuiltValueEnumConst(wireName: r'PERPETUALS')
  static const SSIOOrderLineType PERPETUALS = _$PERPETUALS;

  static Serializer<SSIOOrderLineType> get serializer => _$sSIOOrderLineTypeSerializer;

  const SSIOOrderLineType._(String name): super(name);

  static BuiltSet<SSIOOrderLineType> get values => _$values;
  static SSIOOrderLineType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class SSIOOrderLineTypeMixin = Object with _$SSIOOrderLineTypeMixin;

