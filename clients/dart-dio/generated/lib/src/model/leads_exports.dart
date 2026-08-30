//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_exports.g.dart';

/// LeadsExports
///
/// Properties:
/// * [leadsExportId] - ID for the leads export job.
@BuiltValue()
abstract class LeadsExports implements Built<LeadsExports, LeadsExportsBuilder> {
  /// ID for the leads export job.
  @BuiltValueField(wireName: r'leads_export_id')
  String? get leadsExportId;

  LeadsExports._();

  factory LeadsExports([void updates(LeadsExportsBuilder b)]) = _$LeadsExports;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadsExportsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadsExports> get serializer => _$LeadsExportsSerializer();
}

class _$LeadsExportsSerializer implements PrimitiveSerializer<LeadsExports> {
  @override
  final Iterable<Type> types = const [LeadsExports, _$LeadsExports];

  @override
  final String wireName = r'LeadsExports';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadsExports object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.leadsExportId != null) {
      yield r'leads_export_id';
      yield serializers.serialize(
        object.leadsExportId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadsExports object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadsExportsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'leads_export_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadsExportId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadsExports deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadsExportsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

